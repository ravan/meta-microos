SUMMARY = "Switchyard command-line client and Python library"
DESCRIPTION = "Switchyard routes LLM traffic across providers and translates between the \
OpenAI Chat, Anthropic Messages and OpenAI Responses wire formats. \
 \
This package provides the /usr/bin/switchyard command - the entry point for \
the documented workflow, e.g. 'switchyard launch claude --model switchyard', \
which starts a routing proxy in-process and runs a coding agent through it - \
and the importable switchyard and switchyard_rust Python modules, including the \
compiled extension the library is built on."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause & ISC & MIT-0 & Unicode-3.0 & Zlib"

PV = "0.2.0"

RPM_NAME = "python313-switchyard-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "6ac3ecd0202a623a12c15281fdac664aea925a80d338e48c19b08f5d5aac3e9c6dc602538520d8c4b040e5e2f434f452917e0ddc289b9bbf8dc4933bf607be6b"

RPROVIDES:${PN} += "python3-nemo-switchyard \
python3-switchyard \
python3.13dist-nemo-switchyard \
python313-nemo-switchyard \
python313-switchyard \
python3dist-nemo-switchyard"

RDEPENDS:${PN} += "-python3.13dist(anthropic) < 1 with python3.13dist(anthropic) >= 0.99 \
-python3.13dist(httpx) < 1 with python3.13dist(httpx) >= 0.28.1 \
-python3.13dist(openai) < 3 with python3.13dist(openai) >= 2.7 \
-python3.13dist(pydantic) < 3 with python3.13dist(pydantic) >= 2.13.3 \
/usr/bin/python3.13 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python313-PyYAML \
python313-fastapi \
python313-uvicorn \
update-alternatives"

inherit rpm
