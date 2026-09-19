SUMMARY = "Translation of man pages in Ukrainian"
DESCRIPTION = "This package provides translations of man pages in Ukrainian."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-uk-4.31.0-1.2.noarch.rpm"
RPM_HASH = "1fb75e30ea17f8c398712bcc09b5f75496921a8ed216eec5a9d65b01b472465b29d775930973ddc2dcb9e57c7f09c24ea65c50d95eb3a9c6f6d1b0a9d20f3a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-uk \
man-pages-uk"

RDEPENDS:${PN} += "man-pages"

inherit rpm
