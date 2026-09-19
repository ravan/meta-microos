SUMMARY = "A minimalistic SSH server which implements only a subset of SSHv2 features"
DESCRIPTION = "tinyssh is a minimalistic SSH server which implements only a subset of SSHv2 \
features. It supports only secure cryptography (minimum 128-bit security, \
protected against cache-timing attacks) and doesn't implement unnecessary \
features (such as SSH1 protocol, compression, ...) or older crypto (such as \
RSA, DSA, HMAC-MD5, HMAC-SHA1, 3DES, RC4, ...). tinysshd doesn't implement \
unsafe features (such as password or hostbased authentication) or doesn't \
use dynamic memory allocation (no allocation failures, etc.)"
LICENSE = "CC0-1.0"

PV = "20260601"

RPM_NAME = "tinyssh-20260601-1.3.aarch64.rpm"
RPM_HASH = "f227acdbbff87b6b54d19a1acda9a6d01e858ea6a32a472a9db54865d3fcb874275017a28fe555816f48c6a0f22adaa058bcef0b5c8ec9a503a161bd52f24215"

RPROVIDES:${PN} += "tinyssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
