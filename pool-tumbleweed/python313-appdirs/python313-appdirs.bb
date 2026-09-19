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

RPM_NAME = "python313-appdirs-1.4.4-6.7.noarch.rpm"
RPM_HASH = "1ac8292f6c4652ce4783c8970e5c41a7f812c4bbd41e5fcf45eacc47337b8307600085d279b18fbd6a3be48d476e3f10a6a9234eeeffa3e20ade6a928c5da28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-appdirs \
python3.13dist-appdirs \
python313-appdirs \
python3dist-appdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
