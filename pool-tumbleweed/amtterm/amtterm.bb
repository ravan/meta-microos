SUMMARY = "Serial-over-lan (sol) client for Intel AMT"
DESCRIPTION = "AMT (included in Intel vPro and Centrino Pro) provides out-of-band \
(OOB) management for Desktops and Laptops, using an agent integrated in \
the network adapter and in the motherboard. \
 \
Serial-over-lan provides a (secure) way to connect a remote computer, \
through a pseudo serial interface. \
IDE-redirection provides a way to remotely access a virtual drive, which \
can be used eg. for installation or booting. \
 \
This package provide 2 terminals (amtterm and gamt) to connect to that \
pseudo serial interface from a remote computer. amttool is a perl \
script to gather informations about and remotely control AMT managed \
computers. An additional program (amtider) supports IDE-redirection."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "amtterm-1.7-2.4.aarch64.rpm"
RPM_HASH = "f241580951736a85391d7dae4cd9896e74c69641e1fa60f04a218f0acea9f43bc04cba2a8e28d3b750de3065595893a8ac8fcb7c8167282c934f562db6286a06"

RPROVIDES:${PN} += "amtterm"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
perl-SOAP-Lite"

inherit rpm
