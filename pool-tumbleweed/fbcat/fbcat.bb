SUMMARY = "Framebuffer screenshot programs"
DESCRIPTION = "Contains fbcat and fbgrab for taking a screenshot using the framebuffer \
device. \
 \
Two executables are provided: \
 - Low-level fbcat that operates on the current virtual terminal and writes the \
   screenshot to stdout in the PPM format. \
 - High-level fbgrab that supports the PNG format and virtual terminal switching."
LICENSE = "GPL-2.0"

PV = "0.5.2"

RPM_NAME = "fbcat-0.5.2-1.18.aarch64.rpm"
RPM_HASH = "b5ca39c039506023e438abc5d7f036fce6b6e292eac43912ae85c2546e80dfe5957ba56789b088416edf573ee7cf6921561368a3a9172856e9c458637da5f5f3"

RPROVIDES:${PN} += "fbcat"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
