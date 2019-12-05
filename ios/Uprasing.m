#import "Uprasing.h"


@implementation Uprasing

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(getLanguage: callback:(RCTResponseSenderBlock)callback)
{
    NSString * language = [[NSLocale preferredLanguages] firstObject];
    callback(@[language]);
}

@end
