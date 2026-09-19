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

RPM_NAME = "python314-pypubsub-4.0.3-2.5.noarch.rpm"
RPM_HASH = "9b104f55c3f0ba9e0f27440670ed6a0766ecc0e25a693e02e68d5923a7221cfa27f0feccc8d63f5201149b81462b617a354ce43df7cb841b5529993b697413e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypubsub \
python314-pypubsub \
python3dist-pypubsub"

RDEPENDS:${PN} += "python-abi"

inherit rpm
