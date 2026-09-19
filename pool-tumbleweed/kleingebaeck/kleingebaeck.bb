SUMMARY = "Backup tool for kleinanzeigen.de"
DESCRIPTION = "This tool can be used to backup ads on the German ad page \
https://kleinanzeigen.de \
 \
It downloads all (or only the specified ones) ads of one user into \
a directory, each ad into its own subdirectory. \
 \
The backup will contain a textfile Adlisting.txt which contains \
the ad contents as the title, body, price etc. \
 \
All images will be downloaded as well."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.23"

RPM_NAME = "kleingebaeck-0.3.23-1.8.aarch64.rpm"
RPM_HASH = "58d523c2e1d3632deee23f57d265d99a8649b769322b10720b11ea1d9771c419f2b9cd0f7b5133048b9eb2a40ef01220132d35a7e2ab9820effc4503a39db947"

RPROVIDES:${PN} += "kleingebaeck"

RDEPENDS:${PN} += ""

inherit rpm
