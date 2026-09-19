SUMMARY = "Language Server for RPM spec files"
DESCRIPTION = "This is a proof of concept implementation of a server \
implementing the Language Server Protocol for RPM Spec files."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.2"

RPM_NAME = "python314-rpm-spec-language-server-0.0.2-1.4.noarch.rpm"
RPM_HASH = "006497bedef64e88741d7e914942f26761ca4fdb06451aef52559c1262bdf08ac3ff39b8e661dc01a6f017e8ddee2ab5b5e18984e2cc16389df85880043b548a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rpm-spec-language-server \
python314-rpm-spec-language-server \
python3dist-rpm-spec-language-server"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pygls \
python314-requests \
python314-specfile \
rpm"

inherit rpm
