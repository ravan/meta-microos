SUMMARY = "Include files for development with libffi"
DESCRIPTION = "The libffi library provides a portable, high level programming \
interface to various calling conventions.  This allows a programmer to \
call any function specified by a call interface description at run \
time."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "libffi-devel-3.5.2-2.4.aarch64.rpm"
RPM_HASH = "b409844a87979c3dcea3f10bdb24acda0bfa30e168280780246fea56808a1d7f6bde0bc328421d7a7e2b5606e2a96b23fe5de86642fa63d9408c9588f8117a46"

RPROVIDES:${PN} += "libffi-devel \
pkgconfig-libffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libffi8"

inherit rpm
