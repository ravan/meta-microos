SUMMARY = "The official Python library for the Anthropic API"
DESCRIPTION = "The Anthropic Python library provides convenient access to the \
Anthropic REST API from any Python 3.10+ application. It includes type \
definitions for all request params and response fields, and offers both \
synchronous and asynchronous clients powered by httpx2."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.5.0"

RPM_NAME = "python314-anthropic-1.5.0-1.1.noarch.rpm"
RPM_HASH = "3fdab6768e2e4041a74d89f80eddcc5314e6d816cd5d7b777268392fceae705e549d5c5cdc23d04adffb60489a5c50c2e17a5dbf4f8102875adb40f67a2a1708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-anthropic \
python314-anthropic \
python3dist-anthropic"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-docstring-parser \
python314-httpx2 \
python314-jiter \
python314-pydantic \
python314-sniffio \
python314-typing-extensions"

inherit rpm
