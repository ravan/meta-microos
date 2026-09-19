SUMMARY = "A printer application framework"
DESCRIPTION = "PAPPL is a C-based framework/library for developing CUPS Printer \
Applications, which are the recommended replacement for printer \
drivers. PAPPL supports LPrint and a Gutenprint Printer Application, \
but it is sufficiently general purpose to support any kind of printer \
or driver that can be used on desktops, servers and in embedded \
environments. \
 \
PAPPL supports JPEG, PNG, PWG Raster, Apple Raster, and 'raw' \
printing to printers connected via USB and network \
(AppSocket/JetDirect) connections. PAPPL provides access to the \
printer via its embedded IPP Everywhere service, either local to the \
computer or on your whole network, which can then be discovered and \
used by any application."
LICENSE = "Apache-2.0"

PV = "1.4.12"

RPM_NAME = "pappl-1.4.12-1.1.aarch64.rpm"
RPM_HASH = "6799dfd4600368d24bbe99d15c0454ded7f41b353e03234b6ea37fe88fd84246851824694af032afe5d1e67808b89131574f40c13048a73c29000a1566910e12"

RPROVIDES:${PN} += "pappl"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
