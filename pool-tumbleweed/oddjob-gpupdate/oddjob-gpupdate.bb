SUMMARY = "An oddjob helper which applies group policy objects"
DESCRIPTION = "This package contains the oddjob helper which can be used by the \
pam_oddjob_gpupdate module to apply group policy objects at login-time."
LICENSE = "BSD-3-Clause"

PV = "0.2.0+git.5.ed70836"

RPM_NAME = "oddjob-gpupdate-0.2.0+git.5.ed70836-1.16.aarch64.rpm"
RPM_HASH = "e72e878d8b0d0568eac9a03c9d29a4126df7ec5a8084f6dc9b90ccb1a4226e78cbe345f746733446d4806f101c63879289e829de7f82c7098eea2cb8df4f0f89"

RPROVIDES:${PN} += "config-oddjob-gpupdate \
oddjob-gpupdate"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libpam.so.0 \
oddjob"

inherit rpm
