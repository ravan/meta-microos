SUMMARY = "Shell script analysis tool"
DESCRIPTION = "The goals of ShellCheck are: \
 \
* To point out and clarify typical beginner's syntax issues, that causes a \
shell to give cryptic error messages. \
 \
* To point out and clarify typical intermediate level semantic problems, that \
causes a shell to behave strangely and counter-intuitively. \
 \
* To point out subtle caveats, corner cases and pitfalls, that may cause an \
advanced user's otherwise working script to fail under future circumstances."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "ShellCheck-0.11.0-1.3.aarch64.rpm"
RPM_HASH = "3292560c3abe0889a0557f0c4757b583e12fa98cd65c2be894bcb56eff9db815da741405579997a9e06d06839e55dc733e2ab1476c78aefcd2d52d05cfe2b767"

RPROVIDES:${PN} += "ShellCheck \
shellcheck"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
