SUMMARY = "Minimal Finite State Machine"
DESCRIPTION = "There are many finite state machine implementations for Ruby, and they all \
provide a nice DSL for declaring events, exceptions, callbacks, and all kinds \
of niceties in general. \
But if all you want is a finite state machine, look no further: this has less \
than 50 lines of code and provides everything a finite state machine must \
have, and nothing more."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "ruby4.0-rubygem-micromachine-3.0.0-1.31.aarch64.rpm"
RPM_HASH = "b0dff78ac44d98b0dfd57d69a51b1af00d5345d0f7b5affcaeedc5e323d0421eadc80f1da4f9ab17c259dca692c42086b5e4c99aca341d699b252d929c8255d6"

RPROVIDES:${PN} += "ruby4.0-rubygem-micromachine \
rubygem-micromachine \
rubygem-ruby-4.0.0-micromachine \
rubygem-ruby-4.0.0-micromachine-3 \
rubygem-ruby-4.0.0-micromachine-3.0 \
rubygem-ruby-4.0.0-micromachine-3.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
