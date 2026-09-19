SUMMARY = "Documentation for texlive-epsf"
DESCRIPTION = "This package includes the documentation for texlive-epsf"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.7.4svn77682"

RPM_NAME = "texlive-epsf-doc-2026.226.2.7.4svn77682-61.4.noarch.rpm"
RPM_HASH = "990b72fedaa42b5ec73f5fb7507c0f42e407735449d66bc59ea1ad9ed40f2204d2b0e33ef19158eddf629ff83b10ba0d7f79eac3ce8770fd2a4a9d7566c264c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
