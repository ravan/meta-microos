SUMMARY = "SDL Bomberman clone"
DESCRIPTION = "This is a SDL Bomberman clone. \
 \
You've got to blow up other players to win. Spacebar drops a bomb. Get away \
and hope your enemy gets hit by the flame. The 'b' key is a 2nd control \
for when you are lucky enough to pick up the bomb control--looks like a \
bomb with a timer on it. When you have that the bomb won't go off until \
detonated by another bomb, you are killed, or you press 'b'. \
 \
Blowing up bricks might result in prizes, most of which are good. \
Skates = speed up \
Bomb = allow you to have one more active bomb \
flame = Increase bomb strength \
turtle = makes you move very slowly \
bomb with timer = controlled bomb detonation with 'b' key. \
gold flame = Set flame strength to max \
 \
There isn't much point in playing the game alone (single player). In that \
case the only thing to avoid is accidentally killing yourself. Big deal... \
It's really a multiplayer game."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "sdl_bomber-1.0.10-2.4.aarch64.rpm"
RPM_HASH = "923fc0ece61faf4e90275f9a998cf8a0f171d340a464a1555432e230d85897d42075feaba00435abb9ba0793b53b2aaf4dfe7470cb70e1942e951a2cfcd0c7f3"

RPROVIDES:${PN} += "sdl-bomber"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6"

inherit rpm
