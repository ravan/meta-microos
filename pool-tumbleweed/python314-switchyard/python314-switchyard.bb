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

RPM_NAME = "python314-switchyard-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "b3095d86b6292d602c1627d6726b61b777646e926938357d1240a0df21444ef1dcf481ae634dd14930ca30ef57469f7eed52254944835d3a5ff4ea81b65f984a"

RPROVIDES:${PN} += "python3.14dist-nemo-switchyard \
python314-nemo-switchyard \
python314-switchyard \
python3dist-nemo-switchyard"

RDEPENDS:${PN} += "-python3.14dist(anthropic) < 1 with python3.14dist(anthropic) >= 0.99 \
-python3.14dist(httpx) < 1 with python3.14dist(httpx) >= 0.28.1 \
-python3.14dist(openai) < 3 with python3.14dist(openai) >= 2.7 \
-python3.14dist(pydantic) < 3 with python3.14dist(pydantic) >= 2.13.3 \
/usr/bin/python3.14 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python314-PyYAML \
python314-fastapi \
python314-uvicorn \
update-alternatives"

inherit rpm
