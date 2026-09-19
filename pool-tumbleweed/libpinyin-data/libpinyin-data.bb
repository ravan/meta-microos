SUMMARY = "Data files for the libpinyin IME"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This package provides language model table data for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.3"

RPM_NAME = "libpinyin-data-2.10.3-1.7.aarch64.rpm"
RPM_HASH = "48c1a41fb7dd0718f4bb327ec1e77a30317e040e241dadc3df5fa20f54a1f3129ad9c89a09762a8d58727e361aad318acd32b203f8b61623adce6877610b47b2"

RPROVIDES:${PN} += "libpinyin-data"

RDEPENDS:${PN} += ""

inherit rpm
