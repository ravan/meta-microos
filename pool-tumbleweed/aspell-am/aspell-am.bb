SUMMARY = "Amharic (አማርኛ) Dictionary for Aspell"
DESCRIPTION = "An Amharic (አማርኛ) dictionary for the aspell spell checker."
LICENSE = "SUSE-Public-Domain"

PV = "0.03.1"

RPM_NAME = "aspell-am-0.03.1-4.7.aarch64.rpm"
RPM_HASH = "08ff72ff95421b0eb1cfdd8fa64b824ba3241f122f0917427bea4f9bc11ed82d8dedb9729a31e9a875ded0b509931b08dba6941931fbc0d3014ce3a5ec1b097f"

RPROVIDES:${PN} += "aspell-am \
locale-aspell-am"

RDEPENDS:${PN} += ""

inherit rpm
