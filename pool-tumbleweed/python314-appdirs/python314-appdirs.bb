SUMMARY = "A small Python module for determining platform-specific dirs"
DESCRIPTION = "``appdirs`` will \
help you choose an appropriate: \
 \
- user data dir (``user_data_dir``) \
- user cache dir (``user_cache_dir``) \
- site data dir (``site_data_dir``) \
- user log dir (``user_log_dir``)"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python314-appdirs-1.4.4-6.7.noarch.rpm"
RPM_HASH = "58569fe5ff1027a40602c3b031000ab336690d4b1a0ae8730f883197420894a9d2a556546424e79651afd84d71ad0ed1bc4d4cdc166f0b190864ec5f329898d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-appdirs \
python314-appdirs \
python3dist-appdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
