SUMMARY = "XML data files needed by liboath"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. It contains shared libraries, command line \
tools and a PAM module. Supported technologies include the \
event-based HOTP algorithm (RFC4226) and the time-based TOTP algorithm \
(RFC6238). OATH stands for Open AuTHentication, which is the \
organization that specify the algorithms. For managing secret key \
files, the Portable Symmetric Key Container (PSKC) format described in \
RFC6030 is supported."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.6.14"

RPM_NAME = "oath-toolkit-xml-2.6.14-1.5.noarch.rpm"
RPM_HASH = "b5157cbc8620da11a32fb41f429d7c5f7261275af791dfd73768ca2b6570bbfc41989dd94fa8788d6d7e779f02991233d1cbec0c17a5a44d371fa365db575165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oath-toolkit-xml"

RDEPENDS:${PN} += ""

inherit rpm
