SUMMARY = "Python Publish-Subscribe Package"
DESCRIPTION = "PyPubSub provides a publish - subscribe API that facilitates the development of \
event-based / message-based applications. PyPubSub supports sending and \
receiving messages between objects of an application. It is centered on the \
notion of a topic; senders publish messages of a given topic, and listeners \
subscribe to messages of a given topic. The package also supports a variety of \
advanced features that facilitate debugging and maintaining pypubsub topics and \
messages in larger applications."
LICENSE = "BSD-2-Clause"

PV = "4.0.3"

RPM_NAME = "python313-pypubsub-4.0.3-2.5.noarch.rpm"
RPM_HASH = "652b1f19255f1e6a4ab3e63061fb825691853a8a6e084cbb9d6267f9419a3a18efd47b8545e785916055b041e1eb8ee533d9bb444e48657f02fb9f2a95b1c0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypubsub \
python3.13dist-pypubsub \
python313-pypubsub \
python3dist-pypubsub"

RDEPENDS:${PN} += "python-abi"

inherit rpm
