SUMMARY = "BRLTTY Udev rules for braille devices that use a generic USB to serial adapter"
DESCRIPTION = "This package provides additional rules for managing BRLTTY via Udev. \
 \
Install this package in order to support braille devices that use a generic USB to serial adapter."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-udev-generic-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "e2482e4aaddea3a52451c35b5de6b44a08e69d19dcba78615b65e56a951bdf173056c906198529ad1adcabe106ca83210596e6b17a040bf8d549b5c6dc530fce"

RPROVIDES:${PN} += "brltty-udev-generic"

RDEPENDS:${PN} += "brltty"

inherit rpm
