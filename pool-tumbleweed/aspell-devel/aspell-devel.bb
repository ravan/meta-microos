SUMMARY = "Include Files and Libraries Mandatory for Development with aspell"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require aspell."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8.2"

RPM_NAME = "aspell-devel-0.60.8.2-1.3.aarch64.rpm"
RPM_HASH = "a2ccf233d9aa355c5f1abd7d868bf13b0d28e0b52a1bb8d30d9b2c385d0b87114ea315e1983106f85788d79f0252d70550846b9a648935e8919a52c1d3a820dd"

RPROVIDES:${PN} += "aspell-devel \
pspell-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
info \
libaspell15 \
libpspell15"

inherit rpm
