SUMMARY = "Simple Password Strength Checking Module"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
pam_passwdqc is a simple password strength checking module forPAM-aware \
password changing programs. In addition to checking regular passwords, \
it offers support for passphrases and can provide randomly generated \
ones."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "pam_passwdqc-1.4.0-2.18.aarch64.rpm"
RPM_HASH = "346a6547f0d2cbe78f4f9db9fd5a79842f90e989ae5568fb1f050e6746a96834c2e62b5bf260504479fc31845296b73707a32462359880c5e514c7c79defb2bc"

RPROVIDES:${PN} += "pam-modules-/usr/lib64/security/pam-passwdqc.so \
pam-passwdqc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libpam.so.0 \
libpasswdqc.so.0 \
pam"

inherit rpm
