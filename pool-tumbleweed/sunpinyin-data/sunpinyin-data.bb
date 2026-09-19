SUMMARY = "Data files for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides data files needed by it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-data-2.0.99.2-3.6.noarch.rpm"
RPM_HASH = "c9b07f5ab1f379c0a0a7d6eab96d6b309e66433fd10d5a7e7b3d979fd5566343bd73b8fcdca557cfb18d376cea7aaaf1beb730e09bac318c1b0c5217422a26e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sunpinyin-data"

RDEPENDS:${PN} += ""

inherit rpm
