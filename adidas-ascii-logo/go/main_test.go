package main

import (
	"testing"
)

func TestAdidasLogo(t *testing.T) {
	for _, tc := range testsCases {
		t.Run(tc.name, func(t *testing.T) {
			got := createAdidasAsciiLogo(tc.input)
			if got != tc.want {
				t.Errorf("Unexpected output: got %s want %s", got, tc.want)
			}
		})
	}
}
