SUMMARY = "Blue Moon card solitaire"
DESCRIPTION = "bluemoon - Blue Moon card solitaire \
 \
This 52-card solitaire starts with the entire deck shuffled and \
dealt out in four rows. The aces are then moved to the left end of \
the layout, making 4 initial free spaces. You may move to a space \
only the card that matches the left neighbor in suit, and is one \
greater in rank. Kings are high, so no cards may be placed to their \
right (they create dead spaces). \
 \
When no moves can be made, cards still out of sequence are reshuffled \
and dealt face up after the ends of the partial sequences, leaving \
a card space after each sequence, so that each row looks like a \
partial sequence followed by a space, followed by enough cards to \
make a row of 14. A moment's reflection will show that this game \
cannot take more than 13 deals. A good score is 1-3 deals, 4-7 is \
average, 8 or more is poor."
LICENSE = "BSD-2-Clause"

PV = "2.13"

RPM_NAME = "bluemoon-2.13-1.4.aarch64.rpm"
RPM_HASH = "0ef9560f57fbd2d4dfbe33083fb83c2221df428a23af07469a1ebc73be3251a933c5194579be7f2c072ea47858436cbcd8e2ff57089e110d486ad6ec4c8bed7d"

RPROVIDES:${PN} += "bluemoon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
