SUMMARY = "Development files for libsigrok, an API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats. \
 \
This subpackage contains the headers to make use of the sigrok shared \
libraries."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0~git20241020.f06f788"

RPM_NAME = "libsigrok-devel-0.6.0~git20241020.f06f788-1.7.aarch64.rpm"
RPM_HASH = "abcaac9055bff20f048eb9cbb2dde1b000f77c520a4414e8d3a2254b814291608b1b93181037d117dc6e14d0e7d214e283d50a8f97d6c84095c5725738c8f233"

RPROVIDES:${PN} += "libsigrok-devel \
pkgconfig-libsigrok \
pkgconfig-libsigrokcxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigrok4 \
libsigrokcxx4 \
pkgconfig-bluez \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-glibmm-2.4 \
pkgconfig-hidapi-hidraw \
pkgconfig-libftdi1 \
pkgconfig-libserialport \
pkgconfig-libsigrok \
pkgconfig-libusb-1.0 \
pkgconfig-libzip \
pkgconfig-zlib"

inherit rpm
