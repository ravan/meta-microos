SUMMARY = "Structured Logging for Python"
DESCRIPTION = "structlog makes logging in Python less painful and more powerful by adding \
structure to your log entries. \
 \
It’s up to you whether you want structlog to take care about the output of your \
log entries or whether you prefer to forward them to an existing logging system \
like the standard library’s logging module."
LICENSE = "Apache-2.0 | MIT"

PV = "26.1.0"

RPM_NAME = "python314-structlog-26.1.0-1.3.noarch.rpm"
RPM_HASH = "46681f7692892e0ceff3a85e7b171d9218393e62d8d05ae80b9f4bba905a3a0a62da7f2598449a355ffaa23804c36568cc7b68c1a9118be2227156aa74ab7a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-structlog \
python314-structlog \
python3dist-structlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
