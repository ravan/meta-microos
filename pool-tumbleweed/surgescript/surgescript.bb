SUMMARY = "A scripting language for games"
DESCRIPTION = "SurgeScript is a scripting language for games. It has been designed \
with the specific needs of games in mind. Its features include: \
- The state-machine pattern: objects are state machines, \
  making it easy to create in-game entities \
- The composition approach: you may design complex objects \
  and behaviors by means of composition \
- The hierarchy system: objects have a parent and may have children, \
  in a tree-like structure \
- The game loop: it's defined implicitly \
- Automatic garbage collection, object tagging and more! \
 \
SurgeScript is meant to be used in games and in interactive applications. \
It's easy to integrate it into existing code, it's easy to extend, \
it features a C-like syntax, and it's free and open-source software. \
 \
SurgeScript has been designed based on the experience of its developer \
dealing with game engines, applications related to computer graphics and so on. \
Some of the best practices have been incorporated into the language itself, \
making things really easy for developers and modders."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "surgescript-0.6.1-2.6.aarch64.rpm"
RPM_HASH = "ba948edb58a35dac49df05dcaba5bec940c56e6a9dcbf14562a768f0a5d48e7193988523ea6b0e0b8f3bf3e185037d057ca1a6f2d13b3539023ccd7b74b589b9"

RPROVIDES:${PN} += "surgescript"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsurgescript.so.0.6.1"

inherit rpm
