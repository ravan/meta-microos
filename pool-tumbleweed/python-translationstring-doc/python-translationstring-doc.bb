SUMMARY = "Documentation files for python-translationstring"
DESCRIPTION = "This package contains documentation files for python-translationstring."
LICENSE = "SUSE-Repoze"

PV = "1.4"

RPM_NAME = "python-translationstring-doc-1.4-4.5.noarch.rpm"
RPM_HASH = "ab78635da92a9a178e9285e21ec2b818a84b445744225f4cfe5ba83eb72fecd93198a59dde508b29ba04f58a8328a7baa4ade2f00475fa3a9f50af2a57779f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-translationstring-doc \
python313-translationstring-doc \
python314-translationstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
