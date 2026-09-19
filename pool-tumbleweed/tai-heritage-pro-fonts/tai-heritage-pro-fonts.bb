SUMMARY = "Tai Viet Font"
DESCRIPTION = "The Tai Heritage Pro font is a Unicode-encoded font designed to reflect the \
traditional hand-written style of the Tai Viet script, which is used by the \
Tai Dam, Tai Daeng and Tai Don people who live in northwestern Vietnam and \
surrounding areas."
LICENSE = "OFL-1.1"

PV = "2.600"

RPM_NAME = "tai-heritage-pro-fonts-2.600-1.9.noarch.rpm"
RPM_HASH = "5ffae67e486c19a5ba8434f642eb8c06ab61bbfd0b61ec893987aaefd0016234ba38b6ec1dd475588d3763c80a4278d17eb73cd56a4ad669cd6c655949ebf47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tai-heritage-pro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
