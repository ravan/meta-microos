SUMMARY = "Malay (bahasa Melayu, بهاس ملايو‎) Dictionary for Aspell"
DESCRIPTION = "A Malay (bahasa Melayu, بهاس ملايو‎) dictionary for the aspell spell checker."
LICENSE = "GFDL-1.2-only"

PV = "0.50"

RPM_NAME = "aspell-ms-0.50-4.7.aarch64.rpm"
RPM_HASH = "23b855415935754004ed0b04ba8269bd1fab2a9ed30f254c85b4d518d83a38ad8706f81b29fd6eadbf444c336c24843601f22605a1bc1de311d50ab9eea5e33c"

RPROVIDES:${PN} += "aspell-ms \
locale-aspell-ms"

RDEPENDS:${PN} += ""

inherit rpm
