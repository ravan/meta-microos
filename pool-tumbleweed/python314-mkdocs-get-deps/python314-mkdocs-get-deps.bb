SUMMARY = "MkDocs extension that lists all dependencies according to a mkdocsyml file"
DESCRIPTION = "An extra command for MkDocs that infers required PyPI packages from plugins in mkdocs.yml."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python314-mkdocs-get-deps-0.2.2-1.4.noarch.rpm"
RPM_HASH = "cd5853fd17f0308795301443d0b3bbb86dbfc097639d92f560d364881fdecb9039da2933622481efc068f094dd2992d2855649d7302c4c4d74e1d3b19b3ff813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mkdocs-get-deps \
python314-mkdocs-get-deps \
python3dist-mkdocs-get-deps"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-mergedeep \
python314-platformdirs \
update-alternatives"

inherit rpm
