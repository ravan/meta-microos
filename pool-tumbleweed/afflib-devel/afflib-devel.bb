SUMMARY = "Library for working with the Advanced Forensics Format - Build support"
DESCRIPTION = "The Advanced Forensics Format (AFF) is an openly specified, extensible file \
format for storing and analyzing hard disk images and other types of digital \
evidence. \
 \
This package contains the files that are necessary to develop software that \
makes use of afflib."
LICENSE = "BSD-4-Clause"

PV = "3.7.22"

RPM_NAME = "afflib-devel-3.7.22-1.4.aarch64.rpm"
RPM_HASH = "3e247732e98666742477eeaecf888303fd8b955ed5cc351f9e38d9fb0f79a74c5ca76d9cd0954e10af664e342c822e62ed02ce935556b36ba4b1ec26cc59b0d9"

RPROVIDES:${PN} += "afflib-devel \
pkgconfig-afflib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libafflib0 \
pkgconfig-openssl"

inherit rpm
