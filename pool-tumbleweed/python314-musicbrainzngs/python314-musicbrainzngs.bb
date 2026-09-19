SUMMARY = "Python bindings for musicbrainz NGS webservice"
DESCRIPTION = "This library implements webservice bindings for the Musicbrainz NGS site, also \
known as /ws/2."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "python314-musicbrainzngs-0.7.1-3.5.noarch.rpm"
RPM_HASH = "0fecd6b07a491818754a8d5a943180dd853fb0d695b02bb70728d54385b99603816695ca5383a9586b7d90db4d4c11e2e56ef6c92a887df6a4d7c1de6a113ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-musicbrainzngs \
python314-musicbrainzngs \
python3dist-musicbrainzngs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
