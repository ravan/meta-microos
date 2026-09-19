SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.3"

RPM_NAME = "python314-async_timeout-4.0.3-1.12.noarch.rpm"
RPM_HASH = "faebdf54a81d1db30577750bc7d082498c2b89b548b0de62dc0438fc3bca8433f1310c7f614ef8ed38866aa80dd2a0894a578e94c62021cdbb26b665467e8ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-async-timeout \
python314-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
