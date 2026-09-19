SUMMARY = "Data files for libkkc"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package provides the data files for libkkc."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20240902.ce17a35"

RPM_NAME = "kkc-data-0.3.6~git20240902.ce17a35-4.3.aarch64.rpm"
RPM_HASH = "de6784806c128cbd2838637f7f9a4180055633909f64355ff0a39631f11ea4c5b8c1ce95301a08ad46f1eee3bb61322c83a5cc951dbc4e7ed43ed203c3845987"

RPROVIDES:${PN} += "kkc-data"

RDEPENDS:${PN} += ""

inherit rpm
