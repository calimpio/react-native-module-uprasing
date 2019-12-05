#import "Uprasing.h"


@implementation Uprasing

RCT_EXPORT_MODULE()

- (NSDictionary *)constantsToExport
{
  return @{ @"Language": [[NSLocale preferredLanguages] firstObject] };
}

@end
