SUMMARY = "Name-indexed data processing tool"
DESCRIPTION = "Miller (mlr) allows name-indexed data such as CSV and JSON files to be \
processed with functions equivalent to sed, awk, cut, join, sort etc. It can \
convert between formats, preserves headers when sorting or reversing, and \
streams data where possible so its memory requirements stay small. It works \
well with pipes and can feed 'tail -f'."
LICENSE = "BSD-2-Clause & BSD-4-Clause"

PV = "6.21.0+git20260810.375a0af47"

RPM_NAME = "miller-6.21.0+git20260810.375a0af47-1.1.aarch64.rpm"
RPM_HASH = "df4f543e0835332e649ee979358d16a06815c6d1250d589d1f8b4d4bf909a6ddf89d9d2237de99f31afe237ad4d935fdd3a5f1099187cdfe03d5e43a343471b0"

RPROVIDES:${PN} += "miller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
