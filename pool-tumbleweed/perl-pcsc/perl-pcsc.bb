SUMMARY = "Perl interface to Smart Card Reader"
DESCRIPTION = "PC/SC represents an abstraction layer to smart card readers. It \
provides a communication layer with a wide variety of smart card \
readers through a standardized API."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.16"

RPM_NAME = "perl-pcsc-1.4.16-1.13.aarch64.rpm"
RPM_HASH = "29a4905c4fdd066caa656e17b27d259641f251783867bb55d41d31a4fd6b7f7e04fb7fec80a4762b1dde33392f1dd69f33b567f80dc109dc5af7984d999f38c5"

RPROVIDES:${PN} += "perl-Chipcard--PCSC \
perl-Chipcard--PCSC--Card \
perl-pcsc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-base"

inherit rpm
