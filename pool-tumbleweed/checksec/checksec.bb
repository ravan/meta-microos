SUMMARY = "Utility to check binaries for system hardening"
DESCRIPTION = "Checksec is a GO program to check the properties of executables (like PIE, \
RELRO, PaX, Canaries, ASLR, Fortify Source). It has been originally written by \
Tobias Klein and the original source is available here: \
http://www.trapkit.de/tools/checksec.html \
 \
Modern Linux distributions offer some mitigation techniques to make it harder \
to exploit software vulnerabilities reliably. Mitigations such as RELRO, \
NoExecute (NX), Stack Canaries, Address Space Layout Randomization (ASLR) and \
Position Independent Executables (PIE) have made reliably exploiting any \
vulnerabilities that do exist far more challenging. The checksec script is \
designed to test what *standard* Linux OS and PaX (http://pax.grsecurity.net/) \
security features are being used."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "checksec-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "d313d9a13250eef578caacb1e78eec4c44e68708eb88d55c1f699f0c7c68d52622ad029783fdb9206783bee5faae36434b55426fb50c49a00ab0115a88b959ab"

RPROVIDES:${PN} += "checksec"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
