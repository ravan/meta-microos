SUMMARY = "PAM module with extended dependencies"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains extra modules eg pam_issue and pam_timestamp which \
can have extended dependencies."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.7.2+git48"

RPM_NAME = "pam-extra-1.7.2+git48-1.1.aarch64.rpm"
RPM_HASH = "e916e1cb076d592a8ceab698b50da2b12acb7400c6fa86754caf5c4c27aaa754c2557a5e077b1f76fbef2deafac7df96c843ae27a4f3567be5771e4232aac841"

RPROVIDES:${PN} += "pam-/usr/lib64/security/pam-limits.so \
pam-/usr/sbin/pam-timestamp-check \
pam-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libsystemd.so.0"

inherit rpm
