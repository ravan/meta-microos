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

RPM_NAME = "python314-pyham_pe-1.1.2-1.4.noarch.rpm"
RPM_HASH = "b3dfd9a7b09986fc9654bf5dfa771945339fd35c7c85d2d61c54f16cf780018f62af0d771cdea85b93faf279b465dcb19990c867ae7a4248e2d9c21874ad4dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyham-pe \
python314-pyham-pe \
python3dist-pyham-pe"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
