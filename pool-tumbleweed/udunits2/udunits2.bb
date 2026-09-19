SUMMARY = "A library for manipulating units of physical quantities"
DESCRIPTION = "The Unidata units utility, udunits, supports conversion of unit specifications \
between formatted and binary forms, arithmetic manipulation of unit \
specifications, and conversion of values between compatible scales of \
measurement. A unit is the amount by which a physical quantity is measured. For \
example: \
 \
                  Physical Quantity   Possible Unit \
                  _________________   _____________ \
                        time              weeks \
                      distance         centimeters \
                        power             watts \
 \
This utility works interactively and has two modes. In one mode, both an input \
and output unit specification are given, causing the utility to print the \
conversion between them. In the other mode, only an input unit specification is \
given. This causes the utility to print the definition -- in standard units -- \
of the input unit."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits2-2.2.28-2.8.aarch64.rpm"
RPM_HASH = "016d1720bc318dcd2215b15a79b5595747730555ec6c6a944d69950626f39ee569a826db44db7870021e793ec8ab9429213be6ddd38e4306352f2ccae891df23"

RPROVIDES:${PN} += "udunits2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudunits2.so.0"

inherit rpm
