SUMMARY = "CLI tool to scrape a Prometheus client and dump the result as JSON"
DESCRIPTION = "The prom2json CLI tool scrapes a Prometheus client \
in protocol buffer or text format \
and dumps the result as JSON to stdout"
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "prom2json-1.3.2-2.10.aarch64.rpm"
RPM_HASH = "b48cdabb22dde0e512e62b2e0688d35e89677eddfecb96ccdfcd9917c663e4a939054d34f8fb6d846f6e4cd87a112501dde1c16443192bbf1ff4241b8ad45046"

RPROVIDES:${PN} += "prom2json"

RDEPENDS:${PN} += ""

inherit rpm
