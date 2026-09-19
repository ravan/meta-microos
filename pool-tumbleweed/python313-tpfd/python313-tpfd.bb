SUMMARY = "Text Parsing Function Dispatcher"
DESCRIPTION = "TPFD (Text Parsing Function Dispatcher) is an easy way to parse strings and execute \
functions depending on their contents. \
 \
Inspired by Flask and using Parse under the hood, TPFD allows you to decorate functions \
with grammar rules and if a pattern that matches one of your grammar rules is found, \
the function will be run with a set of keyword arguments you've specified passed to it! \
Great for parsing logs and executing macros on what it finds!"
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python313-tpfd-0.2.4-2.10.noarch.rpm"
RPM_HASH = "3acb47ad566b2e82e2eac8de52cd52158fbdc19da070f9dbdc98b7a0d5154cf23f4af222128984ac9883328df54c52693dce7afaf59bea1d7097af6cc39ef7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tpfd \
python3.13dist-tpfd \
python313-tpfd \
python3dist-tpfd"

RDEPENDS:${PN} += "python-abi \
python313-parse"

inherit rpm
