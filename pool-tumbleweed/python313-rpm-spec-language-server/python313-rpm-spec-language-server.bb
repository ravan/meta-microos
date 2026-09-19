SUMMARY = "Language Server for RPM spec files"
DESCRIPTION = "This is a proof of concept implementation of a server \
implementing the Language Server Protocol for RPM Spec files."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.2"

RPM_NAME = "python313-rpm-spec-language-server-0.0.2-1.4.noarch.rpm"
RPM_HASH = "452d175ce1e5e069ab9584ac17d36bb0806576f92a986a5d9ee29b6cd8376538eb3e9cfbaf407c5045a2d6030324a2ded08043e19fb9037877ff94a01fefc7f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpm-spec-language-server \
python3.13dist-rpm-spec-language-server \
python313-rpm-spec-language-server \
python3dist-rpm-spec-language-server"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pygls \
python313-requests \
python313-specfile \
rpm"

inherit rpm
