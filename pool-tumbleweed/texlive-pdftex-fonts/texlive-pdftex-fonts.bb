SUMMARY = "Severed fonts for texlive-pdftex"
DESCRIPTION = "The  separated fonts package for texlive-pdftex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77868"

RPM_NAME = "texlive-pdftex-fonts-2026.226.svn77868-58.2.noarch.rpm"
RPM_HASH = "b6e19c81971383f93810024f4f5469d5b5d547cd3bcbd8a590d3bc0f653b86dba73533918820f42e553628fd5f69f12ac6cb1d039c7b50d43cd53786c3f88bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-dummyspace \
font-pdftex \
texlive-pdftex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
