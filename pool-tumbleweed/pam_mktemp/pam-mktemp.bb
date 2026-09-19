SUMMARY = "PAM Module to Provide Per-User Private Directories Under /tmp"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
pam_mktemp is a PAM module which may be used with a PAM-aware login \
service to provide per-user private directories under /tmp as a part of \
PAM session or account management."
LICENSE = "SUSE-Permissive"

PV = "1.1.1"

RPM_NAME = "pam_mktemp-1.1.1-11.9.aarch64.rpm"
RPM_HASH = "5fd12e69c0cc221967a53d0857c57c0b5e8c374d9c8be5cfc5bae09a0972e1f0b92247552f1a9c274e1d43b71916bbbf8657ac9d6719e4631f2084b36165217e"

RPROVIDES:${PN} += "pam-mktemp \
pam-modules-/usr/lib64/security/pam-mktemp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
pam"

inherit rpm
