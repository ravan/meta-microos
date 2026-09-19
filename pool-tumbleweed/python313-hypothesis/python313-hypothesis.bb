SUMMARY = "A library for property based testing"
DESCRIPTION = "Hypothesis is a family of testing libraries which let you write tests parametrized \
by a source of examples. A Hypothesis implementation then generates simple and \
comprehensible examples that make your tests fail. This simplifies writing your \
tests and makes them more powerful at the same time, by letting software automate \
the boring bits and do them to a higher standard than a human would, freeing you \
to focus on the higher level test logic. \
 \
This sort of testing is often called 'property-based testing', and the most widely \
known implementation of the concept is the Haskell library QuickCheck, but \
Hypothesis differs significantly from QuickCheck and is designed to fit idiomatically \
and easily into existing styles of testing that you are used to, with absolutely no \
familiarity with Haskell or functional programming needed."
LICENSE = "MPL-2.0"

PV = "6.152.6"

RPM_NAME = "python313-hypothesis-6.152.6-1.2.noarch.rpm"
RPM_HASH = "33130c9a3e8dedcd66741cc9b141f00120b037e8fdce83c21f745c816f5b38c813039622dffe6e6dca9abce86967a21102f9bb8233d281e98d56edc41a96809b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesis \
python3.13dist-hypothesis \
python313-hypothesis \
python3dist-hypothesis"

RDEPENDS:${PN} += "-python313-sortedcontainers >= 2.1.0 with python313-sortedcontainers < 3.0 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-attrs"

inherit rpm
