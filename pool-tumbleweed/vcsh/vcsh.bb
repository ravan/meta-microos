SUMMARY = "Config manager for $HOME based on git"
DESCRIPTION = "vcsh allows you to have several git repositories, all maintaining \
their working trees in $HOME without clobbering each other. That, in \
turn, means you can have one repository per config set (zsh, vim, \
ssh, etc), picking and choosing which configs you want to use on \
which machine."
LICENSE = "GPL-2.0-only"

PV = "1.20151229"

RPM_NAME = "vcsh-1.20151229-4.7.noarch.rpm"
RPM_HASH = "d4ba5f8ee48fde158c2836ee98eb825c28c4bfcb211dd3c61df1630898353a5b9b96d6038f67d91858ea4f82f8e781f1083f1820021c21a00c05fe905c01a679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vcsh"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
git-core"

inherit rpm
