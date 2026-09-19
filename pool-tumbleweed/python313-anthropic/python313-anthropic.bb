SUMMARY = "The official Python library for the Anthropic API"
DESCRIPTION = "The Anthropic Python library provides convenient access to the \
Anthropic REST API from any Python 3.10+ application. It includes type \
definitions for all request params and response fields, and offers both \
synchronous and asynchronous clients powered by httpx2."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.5.0"

RPM_NAME = "python313-anthropic-1.5.0-1.1.noarch.rpm"
RPM_HASH = "bc76419eb3c799ececde35dbb03ca121b1eabf8e264ed2c9ce35587e054e062d6c8c659b6d9203bbc0137063b09c459fccce77e65c9bf4bfa3829b26ce07f256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anthropic \
python3.13dist-anthropic \
python313-anthropic \
python3dist-anthropic"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-docstring-parser \
python313-httpx2 \
python313-jiter \
python313-pydantic \
python313-sniffio \
python313-typing-extensions"

inherit rpm
