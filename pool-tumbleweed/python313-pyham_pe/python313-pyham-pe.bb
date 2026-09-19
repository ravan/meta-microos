SUMMARY = "Client implementation of the AGWPE protocol for packet radio"
DESCRIPTION = "This package provides a client implementation of the AGWPE protocol, enabling \
and simplifying the creation of applications using that protocol in order to \
communicate with servers such as Direwolf or ldsped. \
 \
A lower level API provides access to the protocol at a level close to that of \
individual AGWPE frames (not to be confused with AX.25 frames), enabling the \
ultimate level of control over communication with the server. \
 \
A higher level API provides abstractions helpful in building more complex \
applications, transparently taking care of some of the details, such as \
connection management and monitoring. \
 \
The AGWPE protocol, and thus this package, has the advantage, over other \
commonly used protocols such as KISS, that it can be easily used to create \
connected-mode sessions. As such, it can be used to create many types of ham \
radio software, from simple beaconing to full-fledged packet radio terminal \
applications akin to Linpac. (See PyHam’s Paracon software for an example of \
the latter.)"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-pyham_pe-1.1.2-1.4.noarch.rpm"
RPM_HASH = "d31b2edc40c58a6ab1ec8864568049ae20537d0b5b53ac84b5a900a55fa19cdc211e644a730aa7e7ea394d83a8cefbf0a5f1cbff55fba48ece8f3ab826da6b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyham-pe \
python3.13dist-pyham-pe \
python313-pyham-pe \
python3dist-pyham-pe"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
