SUMMARY = "Sans serif, Unicode-compliant Font For Literacy Use"
DESCRIPTION = "Andika is a sans serif, Unicode-compliant font designed \
especially for literacy use, taking into account the needs of \
beginning readers. The focus is on clear, easy-to-perceive \
letterforms that will not be readily confused with one another. \
 \
A sans serif font is preferred by some literacy personnel for \
teaching people to read. Its forms are simpler and less cluttered \
than those of most serif fonts."
LICENSE = "OFL-1.1"

PV = "7.000"

RPM_NAME = "sil-andika-fonts-7.000-1.4.noarch.rpm"
RPM_HASH = "e8ae4dae45936cd1a7464d9124bc242fa86316ca92cc3b411c5cb6fe5ddd830021177b782f2274806aecfc691f647ed5ed120d87645556a11d639c89a86a25ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sil-andika-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
