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

RPM_NAME = "python314-hypothesis-6.152.6-1.2.noarch.rpm"
RPM_HASH = "4c5e3de779f1724182cc478d65cb0d0ca10566201afc6156927f8b46956bbec3da713ee47ef116e5d052a8c59d8eafd983ad3c577e9f5f7653c676d72960600d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hypothesis \
python314-hypothesis \
python3dist-hypothesis"

RDEPENDS:${PN} += "-python314-sortedcontainers >= 2.1.0 with python314-sortedcontainers < 3.0 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-attrs"

inherit rpm
